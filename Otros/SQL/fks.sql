alter table usuario add constraint fk_usuario_rol foreign key (rol) references roll (id);

alter table reserva add constraint fk_reserva_usuario foreign key (usuario) references usuario (id);

alter table reserva add constraint fk_reserva_recurso foreign key (recurso) references recurso (id);