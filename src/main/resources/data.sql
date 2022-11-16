insert into groot.roles (id, name)
values  (1, 'ROLE_USER'),
        (2, 'ROLE_ADMIN');

insert into groot.users (id, first_name, last_name, age, email, password)
values  (1, 'Evgeny', 'Kozhevnikov', 43, 'Evgeny@mail.ru', '$2a$10$w9xH1lh9YcoCNmWlsVzd9Or8crhJqPtUtf4TCyEtPevAcbObH7TfK'),
        (2, 'Igor', 'Entaev', 33, 'Igor@mail.ru', '$2a$10$w9xH1lh9YcoCNmWlsVzd9Or8crhJqPtUtf4TCyEtPevAcbObH7TfK'),
        (3, 'German', 'Sevostyanov', 26, 'German@mail.ru', '$2a$10$w9xH1lh9YcoCNmWlsVzd9Or8crhJqPtUtf4TCyEtPevAcbObH7TfK');
# пароль 100 у всех
insert into groot.users_roles (user_id, role_id)
values  (1, 1),
        (1, 2),
        (2, 1),
        (3, 1);

