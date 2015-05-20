create table quarters(
  fiscal_year varchar(4),
  quarter integer,
  created_at TIMESTAMP,
  primary key(fiscal_year,quarter)
);
