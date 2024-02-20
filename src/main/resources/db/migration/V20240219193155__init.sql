create table message(
    id text     not null    constraint message_pk primary key,
    message text    not null
);

comment on table message is 'Table for messages';