"""
PostingService
Микросервис для публикации и редактирования сообщений в Telegram-каналах.
"""

from fastapi import FastAPI, HTTPException
from pydantic import BaseModel
from typing import Dict, Optional
import uvicorn

# Создаём приложение FastAPI
app = FastAPI(
    title="Posting Service",
    description="Отправляет и редактирует сообщения через TgAdapterPostingService",
    version="0.1.0"
)

# DTO 
class PostMessageRequest(BaseModel):
    """
    Тело запроса для POST /api/post_msg/
    Содержит все необходимые данные для отправки сообщения в канал.
    """
    channel_id: int          # ID канала в Telegram (числовой или строка с @username)
    text: str                # Текст сообщения (может содержать HTML или Markdown)
    parse_mode: Optional[str] = "HTML"  # Режим форматирования: "HTML", "Markdown", None
    # В будущем можно добавить: media_url, reply_to_msg_id, disable_notification и т.д.

class ChangeMessageRequest(BaseModel):
    """
    Тело запроса для POST /api/change_msg/{msg_id}
    Используется для редактирования уже отправленного сообщения.
    """
    new_text: str            # Новый текст сообщения
    channel_id: Optional[int] = None  # Иногда нужно указать канал, чтобы найти сообщение
    parse_mode: Optional[str] = "HTML"  # Режим форматирования для нового текста

#Вспомогательные функции
def call_tg_adapter_post_message(channel_id: int, text: str, parse_mode: str) -> Dict:
    """
    Выполняет HTTP-запрос к TgAdapterPostingService: POST /api/post_msg/
    Передаёт channel_id, text, parse_mode.
    Возвращает ответ от адаптера: { "message_id": ..., "status": ... }
    """
    pass

def call_tg_adapter_change_message(msg_id: int, new_text: str, parse_mode: str, channel_id: Optional[int]) -> Dict:
    """
    Выполняет HTTP-запрос к TgAdapterPostingService: POST /api/change_msg/{msg_id}
    Передаёт новый текст и опционально channel_id.
    Возвращает ответ адаптера.
    """
    pass

def log_posting_attempt(channel_id: int, success: bool, details: str):
    """
    Логирует попытку отправки/редактирования (в файл или БД).
    Используется для аудита и отладки.
    """
    pass

#API эндпоинты
@app.post("/api/post_msg/", response_model=Dict)
async def post_message(request: PostMessageRequest):
    """
    Отправляет сообщение в указанный канал через TgAdapterPostingService.
    Принимает channel_id, текст и parse_mode.
    Возвращает message_id, статус и краткую информацию.
    """
    # Вызываем адаптер
    adapter_response = call_tg_adapter_post_message(
        channel_id=request.channel_id,
        text=request.text,
        parse_mode=request.parse_mode or "HTML"
    )
    
    # Логируем результат
    success = adapter_response.get("status") == "sent"
    log_posting_attempt(request.channel_id, success, f"msg_id={adapter_response.get('message_id')}")
    
    # Возвращаем результат
    return {
        "status": "sent" if success else "failed",
        "message_id": adapter_response.get("message_id"),
        "channel_id": request.channel_id,
        "text_preview": request.text[:50]
    }

@app.post("/api/change_msg/{msg_id}", response_model=Dict)
async def change_message(msg_id: int, request: ChangeMessageRequest):
    """
    Редактирует существующее сообщение по его ID.
    Принимает новый текст, опционально channel_id.
    Возвращает статус обновления.
    """
    # Вызываем адаптер для редактирования
    adapter_response = call_tg_adapter_change_message(
        msg_id=msg_id,
        new_text=request.new_text,
        parse_mode=request.parse_mode or "HTML",
        channel_id=request.channel_id
    )
    
    success = adapter_response.get("status") == "updated"
    log_posting_attempt(msg_id, success, f"updated to: {request.new_text[:30]}")
    
    return {
        "status": "updated" if success else "failed",
        "message_id": msg_id,
        "new_text_preview": request.new_text[:50]
    }

#Запуск сервиса
if __name__ == "__main__":
    # PostingService будет слушать порт 8001 (можно изменить)
    uvicorn.run(app, host="0.0.0.0", port=8001)
