create
    definer = ssg@localhost procedure sakilaCustomerCount()
BEGIN
  DECLARE customer_cnt INT;
  DECLARE add_number INT;    -- 변수 선언

  SET customer_cnt = 0;
  SET add_number = 10;

  SET customer_cnt = (SELECT count(*) FROM customer);

  SELECT customer_cnt;

end;

