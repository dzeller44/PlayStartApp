# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table profile (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  address                   varchar(255),
  address1                  varchar(255),
  city                      varchar(255),
  state                     varchar(255),
  zip                       varchar(255),
  primary_name_first        varchar(255),
  primary_name_last         varchar(255),
  primary_phone             varchar(255),
  primary_email             varchar(255),
  secondary_name_first      varchar(255),
  secondary_name_last       varchar(255),
  secondary_phone           varchar(255),
  secondary_email           varchar(255),
  services                  varchar(255),
  services_other            varchar(255),
  date_creation             datetime(6),
  profilekey                varchar(255),
  userkey                   varchar(255),
  updated_by                varchar(255),
  date_updated              datetime(6),
  constraint pk_profile primary key (id))
;

create table removed_profile (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  address                   varchar(255),
  address1                  varchar(255),
  city                      varchar(255),
  state                     varchar(255),
  zip                       varchar(255),
  primary_name_first        varchar(255),
  primary_name_last         varchar(255),
  primary_phone             varchar(255),
  primary_email             varchar(255),
  secondary_name_first      varchar(255),
  secondary_name_last       varchar(255),
  secondary_phone           varchar(255),
  secondary_email           varchar(255),
  services                  varchar(255),
  services_other            varchar(255),
  date_creation             datetime(6),
  profilekey                varchar(255),
  userkey                   varchar(255),
  updated_by                varchar(255),
  date_updated              datetime(6),
  removed_by                varchar(255),
  date_removed              datetime(6),
  constraint pk_removed_profile primary key (id))
;

create table removed_user (
  id                        bigint auto_increment not null,
  email                     varchar(255),
  fullname                  varchar(255),
  confirmation_token        varchar(255),
  password_hash             varchar(255),
  date_creation             datetime(6),
  validated                 tinyint(1) default 0,
  role                      integer,
  approved                  varchar(255),
  active                    varchar(255),
  userkey                   varchar(255),
  updated_by                varchar(255),
  date_updated              datetime(6),
  removed_by                varchar(255),
  date_removed              datetime(6),
  constraint ck_removed_user_role check (role in ('0','2','3','1')),
  constraint uq_removed_user_email unique (email),
  constraint uq_removed_user_fullname unique (fullname),
  constraint pk_removed_user primary key (id))
;

create table service (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  shortname                 varchar(255),
  comment                   varchar(255),
  constraint pk_service primary key (id))
;

create table session (
  id                        integer auto_increment not null,
  hash                      varchar(255),
  user_id                   integer,
  expiration_date           datetime(6),
  data                      varchar(255),
  constraint pk_session primary key (id))
;

create table token (
  token                     varchar(255) not null,
  user_id                   bigint,
  type                      varchar(8),
  date_creation             datetime(6),
  email                     varchar(255),
  constraint ck_token_type check (type in ('password','email','admin')),
  constraint pk_token primary key (token))
;

create table user (
  id                        bigint auto_increment not null,
  email                     varchar(255),
  fullname                  varchar(255),
  confirmation_token        varchar(255),
  password_hash             varchar(255),
  date_creation             datetime(6),
  validated                 tinyint(1) default 0,
  role                      integer,
  approved                  varchar(255),
  active                    varchar(255),
  userkey                   varchar(255),
  updated_by                varchar(255),
  date_updated              datetime(6),
  constraint ck_user_role check (role in ('0','2','3','1')),
  constraint uq_user_email unique (email),
  constraint uq_user_fullname unique (fullname),
  constraint pk_user primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table profile;

drop table removed_profile;

drop table removed_user;

drop table service;

drop table session;

drop table token;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

