
create trigger BU_Recurso_Estado
before update on recurso
for each row
execute procedure public.BU_Recurso_Estado();


create function public.BU_Recurso_Estado()
	returns trigger
	language 'plpgsql'
as $BODY$
begin
	if new.averiado=true
	then
		new.disponible:=false;
	end if;

	return new;
end;
$BODY$
