from sys import exit as getout

lang = int(input("1. English/2. Español: "))
if lang == 1:
    quotes = ["Give me the numeric day: ", "Give the number of the month: ",
        "Give me the 2 last numbers of the year: ", "Give me the 2 first numbers of the year: ",
        "You have written an incorrect day number", "Some numbers you have written are wrong",
        "The result is ", " AKA ", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday"]
elif lang == 2:
    quotes = ["Dame el dia numerico: ", "Dame el mes en numero: ",
        "Dame las 2 ultimas cifras del año: ", "Dame las 2 primeras cifras del año: ",
        "Has puesto un numero de dia incorrecto", "Alguno de los numeros que has puesto es incorrecto",
        "El resultado es ", ", que seria ", "Sabado", "Domingo", "Lunes", "Martes", "Miercoles",
        "Jueves", "Viernes"]
else:
    print("You did not choose the correct languague / No elejiste el idioma correcto"); getout()

q = int(input(quotes[0])) # Dia
w = int(input(quotes[1])) # Mes
k = int(input(quotes[2])) # Año
j = int(input(quotes[3])) # Prefijo año

if w == 1 or w == 2:
    w = w + 12
    k -= 1

if q > 29 and w == 14:
    print(quotes[4]); getout() #Febrero tiene 29 dias

'''if len(str(q)) > 2 or len(str(q)) < 0 or len(str(w)) > 2 or len(str(w)) < 0 or len(str(k)) > 2 or len(str(k)) < 0 or len(str(j)) > 2 or len(str(j)) < 0:
    print(quotes[5]); getout()'''

h = ((q + (13 * (w + 1) // 5) + k + (k // 4) + (j // 4) - (2 * j) + 700) % 7)

if q < 0 or q > 31:
    print(h)

print(h)

if (h == 0):
    print(f"{quotes[6]} {h}, {quotes[7]} {quotes[8]}")
elif (h == 1):
    print(f"{quotes[6]} {h}, {quotes[7]} {quotes[9]}")
elif (h == 2):
    print(f"{quotes[6]} {h}, {quotes[7]} {quotes[10]}")
elif (h == 3):
    print(f"{quotes[6]} {h}, {quotes[7]} {quotes[11]}")
elif (h == 4):
    print(f"{quotes[6]} {h}, {quotes[7]} {quotes[12]}")
elif (h == 5):
    print(f"{quotes[6]} {h}, {quotes[7]} {quotes[13]}")
elif (h == 6):
    print(f"{quotes[6]} {h}, {quotes[7]} {quotes[14]}")
