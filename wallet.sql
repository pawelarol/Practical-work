DROP TABLE IF EXISTS wallet;

CREATE TABLE wallet(
transfer_id_table SERIAL,
transfer_id integer not null,
transfer_date timestamp not null,
all_money integer,
come_money integer,
out_money integer,
net_profit integer,
PRIMARY KEY(transfer_id)
);