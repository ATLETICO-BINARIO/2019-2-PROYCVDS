from random import randrange
from datetime import timedelta
from datetime import datetime

def random_date(start, end):
    """
    This function will return a random datetime between two datetime 
    objects.
    """
    delta = end - start
    int_delta = (delta.days * 24 * 60 * 60) + delta.seconds
    random_second = randrange(int_delta)
    return start + timedelta(seconds=random_second)



d1 = datetime.strptime('12/15/2018 1:30 PM', '%m/%d/%Y %I:%M %p')
d2 = datetime.strptime('12/15/2019 4:50 AM', '%m/%d/%Y %I:%M %p')

recurso=[105, 116, 102, 113, 125, 121, 103, 107, 114, 104, 108, 124, 118, 117, 111, 122, 123, 112, 127, 119]

for i in range(5,30):
    s = "INSERT INTO reserva(id,fecha_inicio,fecha_fin,fecha_reserva,usuario,recurso) VALUES "
    r1 = r.randint(1,30)
    date1 = random_date(d1, d2).date()
    date2 = random_date(d1, d2).date()
    date3 = random_date(d1, d2).date()
    s += "("+str(i)+",'"
    if (date1 >= date2):
        if(date1>=date3):          
            s+=str(date2)+"','"+str(date1)+"','"+str(date3)
        else:
            s+=str(date2)+"','"+str(date3)+"','"+str(date1)
    else:
        if(date2>=date3):
            s+=str(date1)+"','"+str(date2)+"','"+str(date3)
        else:
            s+=str(date1)+"','"+str(date3)+"','"+str(date2)

    s+="',"+str(r1)+","+str(r.choice(recurso))+");\n"

    print(s)
