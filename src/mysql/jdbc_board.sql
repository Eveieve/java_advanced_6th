create table jdbc_board (
                            board_no             int             primary key auto_increment,
                            board_title          varchar(100)    not null,
                            board_content        longtext        not null,
                            board_writer         varchar(50)     not null,
                            board_date           datetime        default now()

);