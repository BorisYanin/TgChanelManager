# Contracts of interaction
## UIBot
   ```
   -> FulfillmentService        get  /api/get_all_channel
   -> FulfillmentService        get  /api/get_channel/{channel_id}
   -> FulfillmentService        post /api/get_channel/filter // в теле инфа по которой должны найтись каналы
   -> FulfillmentService        post /api/book_channel/{channel_id}
   -> FulfillmentService        post /api/change_owner/{channel_id}
   -> FulfillmentService        post /api/create_channel // в теле какие то параметры
   -> Content-Scheduler Service post /api/change_scheduler_params/{channel_id}
   ```
## Content-Scheduler Service
   ```
   post /api/add_account_schedule/{account_id}// добавляем аккаунт для планирования + в теле настройки этого планирования
   ```

## PostingService
   ```
   post /api/post_msg/
   post /api/change_msg/{msg_id}
   ```

## ChannelService
   ```
   post /api/create_channel

   get  /api/get_channel_info
   return data from db

   post /api/change_owner/{channel_id}
   -> TgAdapterChannelService post /api/change_owner/{channel_id}

   ```

## TgAdapterPostingService
   ```
   post /api/post_msg/
   post /api/change_msg/{msg_id}
   get  /api/get_channel_info
   ```

## TgAdapterChannelService
   ```
   post /api/create_tg_channel
   get  /api/get_tg_channel_info
   get  /api/get_tg_channel_statistic
   post /api/change_owner/{channel_id}
   ```

## FulfillmentService
   ```
   get  /api/get_all_channel
   get  /api/get_channel/{channel_id}
   post /api/get_channel/filter // в теле инфа по которой должны фильтроваться каналы
   // все запросы выше просто ищут инфу в своей бд

   post /api/book_channel/{channel_id} // Думаю лучше здесь просто менять параметры в бд этого сервиса

   post /api/change_owner/{channel_id}
   -> ChannelService post /api/change_owner/{channel_id}

   post /api/create_channel
   -> Content-Scheduler Service post /api/add_account_schedule/{account_id} // Если надо добавить то есть опционально
   -> ChannelService             post /api/create_channel
   ```
 
 
