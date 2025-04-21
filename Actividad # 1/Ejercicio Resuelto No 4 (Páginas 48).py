# Ejercicio Resuelto No. 4
# Calcular las edades de Alberto, Ana y la mamá, dadas la edad de Juan

# Entrada de datos
EDJUAN = float(input("Ingrese la edad de Juan: "))

# Proceso
EDALBER = 2 * EDJUAN / 3
EDANA = 4 * EDJUAN / 3
EDMAMA = EDJUAN + EDALBER + EDANA

# Salida
print("\nLAS EDADES SON:")
print(f"ALBERTO: {EDALBER:.0f} años")
print(f"JUAN: {EDJUAN:.0f} años")
print(f"ANA: {EDANA:.0f} años")
print(f"MAMÁ: {EDMAMA:.0f} años")
