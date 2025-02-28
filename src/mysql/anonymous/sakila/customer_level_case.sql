create
    definer = ssg@localhost procedure customer_level_case(IN customer_id_input int)
BEGIN
    DECLARE customer_level varchar(10);
    DECLARE amount_sum float;


    SET amount_sum = (SELECT sum(amount) from payment where customer_id = customer_id_input group by customer_id);


    CASE
        WHEN amount_sum >= 150 THEN SET customer_level = 'VVIP';
        WHEN amount_sum >= 1250 THEN SET customer_level = 'VIP';
        WHEN amount_sum >= 100 THEN SET customer_level = 'GOLD';
        WHEN amount_sum >= 80 THEN SET customer_level = 'SILVER';
        ELSE SET customer_level = 'BRONZE';
        end CASE;

      SELECT customer_id_input as customer_id , amount_sum, customer_level;

    END;

