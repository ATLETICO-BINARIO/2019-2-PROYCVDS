
alter table recurso add constraint ck_averiado_disponible check(not(disponible=true) or (averiado=false));