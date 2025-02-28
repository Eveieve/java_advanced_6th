create
    definer = root@localhost procedure rewards_report(IN min_monthly_purchases tinyint unsigned,
                                                      IN min_dollar_amount_purchased decimal(10, 2) unsigned,
                                                      OUT count_rewardees int)
    comment 'Provides a customizable report on best customers'
    reads sql data
-- missing source code
;

