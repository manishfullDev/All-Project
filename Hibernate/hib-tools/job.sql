create table job (job_no integer not null, job_title varchar(100) not null, min_experience integer default 0, max_experience integer not null, role_nm varchar(30) not null, organization varchar(200) not null, positions integer default 1, primary key (job_no)) ENGINE=InnoDB
alter table job add constraint UK_oq972g9fk91997eogpf8n0o1x  unique (job_title)
