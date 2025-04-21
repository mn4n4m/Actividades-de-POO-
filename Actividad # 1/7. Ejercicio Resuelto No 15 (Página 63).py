# Ejercicio Resuelto No. 15
# Determinar cuál esfera (A, B, C, D) es diferente en peso y si es de mayor o menor peso

# Entrada de datos
PESOA = float(input("Ingrese el peso de la esfera A: "))
PESOB = float(input("Ingrese el peso de la esfera B: "))
PESOC = float(input("Ingrese el peso de la esfera C: "))
PESOD = float(input("Ingrese el peso de la esfera D: "))

# Proceso y salida
if PESOA == PESOB and PESOA == PESOC:
    # D es la diferente
    if PESOD > PESOA:
        print("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO")
    else:
        print("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO")
elif PESOA == PESOB and PESOA == PESOD:
    # C es la diferente
    print("LA ESFERA C ES LA DIFERENTE", end=" ")
    if PESOC > PESOA:
        print("Y ES DE MAYOR PESO")
    else:
        print("Y ES DE MENOR PESO")
elif PESOA == PESOC and PESOA == PESOD:
    # B es la diferente
    print("LA ESFERA B ES LA DIFERENTE", end=" ")
    if PESOB > PESOD:
        print("Y ES DE MAYOR PESO")
    else:
        print("Y ES DE MENOR PESO")
else:
    # A es la diferente
    print("LA ESFERA A ES LA DIFERENTE", end=" ")
    if PESOA > PESOB:
        print("Y ES DE MAYOR PESO")
    else:
        print("Y ES DE MENOR PESO")
