import random as r

ubicacion = ["edificio F", "edificio H", "edificio B", "edificio A","edificio C"]
tipo_r = ["computador","sala de estudio","libro"]
ru =[]

for i in range(0,20):
    s = "INSERT INTO recurso(id,disponible,averiado,ubicacion,nombre,capacidad,tipo_recurso) VALUES "
    r1 = r.randint(101,127)
    r2 = r.randint(1,17)
    r3 = r.randint(1,5)
    b = r.choice([True, False])
    b1 = True;
    while r1 in ru:
        r1 = r.randint(101,127)
    ru.append(r1)
    
    if(b):
        b1=False;
    s += "("+str(r1)+","+str(b)+","+str(b1)+",'"+r.choice(ubicacion)+"','"
    tipo= r.choice(tipo_r)
    if(tipo == "computador"):
        s+="PC"+str(r1)+"',"+r.choice(["0","1"])+",'"+tipo+"');\n"
    elif(tipo == "sala de estudio"):
        s+="SALA"+str(r2)+"',"+r.choice(["0","1"])+",'"+tipo+"');\n"        
    elif(tipo == "libro"):
        s+="Ejemplar"+str(r3)+"',"+r.choice(["0","1"])+",'"+tipo+"');\n"

    print(s)

print(ru)
