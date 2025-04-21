# Ejercicio Resuelto No. 9
# Determinar el valor de X según condiciones sobre A, B, C y Y

# Entrada de datos
Y = float(input("Ingrese el valor de Y: "))
A = float(input("Ingrese el valor de A: "))
B = float(input("Ingrese el valor de B: "))
C = float(input("Ingrese el valor de C: "))

# Lógica condicional según el algoritmo propuesto
if Y < A and A < B and B < C:
    X = 0
elif A <= Y < B:
    X = 1
elif B <= Y < C:
    X = 2
elif C <= Y:
    X = 3
else:
    X = 4

# Salida
print(f"El valor de X es: {X}")
