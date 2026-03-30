# Contracts of interaction
## UIBot
   ```
   -> FulfillmentService        get  /api/get_all_chanel 
   -> FulfillmentService        get  /api/get_chanel/{chanel_id}
   -> FulfillmentService        get  /api/get_chanel/filter // в теле инфа по которой должны найтись каналы
   -> FulfillmentService        post /api/book_chanel/{chanel_id}
   -> FulfillmentService        post /api/change_owner/{chanel_id}
   -> FulfillmentService        post /api/create_chanel // в теле какие то параметры
   -> Content-Scheduler Service post /api/change_scheduler_params{chanel_id} 
   ```
## Content-Scheduler Service
   ```
   post /api/add_account_schedule{account_id}// добовляем акаунт для планирования + в теле настройки этого планирования 
   ```

## PostingService
   ```
   post /api/post_msg/
   post /api/change_msg/{msg_id}
   ```

## ChanelService
   ```
   post /api/create_chanel
   
   get  /api/get_chanel_inf
   return data from db

   post /api/change_owner
   -> TgAdapterChanelService post /api/change_owner/{chanel_id}
   
   ```

## TgAdapterPostingService
   ``` 
   post /api/post_msg/
   post /api/change_msg/{msg_id}
   get  /api/get_chanel_inf
   ```

## TgAdapterChanelService 
   ``` 
   post /api/create_tg_chanel
   get  /api/get_tg_chanel_inf
   get  /api/get_tg_chanel_statistic
   ```

## FulfillmentService
   ``` 
   get  /api/get_all_chanel
   get  /api/get_chanel/{chanel_id}
   get  /api/get_chanel/filter // в теле инфа по которой должны фильтроваться каналы
   // все запросы выше просто ищет инфу в своей бд 

   post /api/book_chanel/{chanel_id} // Думаю лучше здесь просто менять параметры в бд этого сервиса

   post /api/change_owner/{chanel_id}
   -> ChanelService post /api/change_owner{chanel_id}
   
   post /api/create_chanel/{chanel_id}
   -> Content-Scheduler Service post /api/add_account_schedule{account_id} // Если надо добавить (то есть опционально)
   -> ChanelService             post /api/create_chanel
   ```
 
 
