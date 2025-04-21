# Ejercicio Resuelto No. 11
# Encontrar el número mayor entre tres números diferentes

# Entrada de datos
N1 = int(input("Ingrese el primer número: "))
N2 = int(input("Ingrese el segundo número: "))
N3 = int(input("Ingrese el tercer número: "))

# Proceso
if N1 > N2 and N1 > N3:
    MAYOR = N1
elif N2 > N3:
    MAYOR = N2
else:
    MAYOR = N3

# Salida
print(f"EL VALOR MAYOR ENTRE: {N1}, {N2} Y {N3} ES: {MAYOR}")
