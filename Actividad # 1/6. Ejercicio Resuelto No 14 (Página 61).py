# Ejercicio Resuelto No. 14
# Calcular el salario final de los vendedores de cada departamento según el plan de incentivos

# Entrada de datos
VD1 = float(input("Ingrese las ventas del departamento 1: "))
VD2 = float(input("Ingrese las ventas del departamento 2: "))
VD3 = float(input("Ingrese las ventas del departamento 3: "))
SALAR = float(input("Ingrese el salario base de los vendedores: "))

# Cálculo del total de ventas y el 33% de ese total
TOTVEN = VD1 + VD2 + VD3
PORVEN = 0.33 * TOTVEN

# Cálculo del salario final por departamento
if VD1 > PORVEN:
    SALAR1 = SALAR + 0.2 * SALAR
else:
    SALAR1 = SALAR

if VD2 > PORVEN:
    SALAR2 = SALAR + 0.2 * SALAR
else:
    SALAR2 = SALAR

if VD3 > PORVEN:
    SALAR3 = SALAR + 0.2 * SALAR
else:
    SALAR3 = SALAR

# Salida
print(f"\nSALARIO VENDEDORES DEPTO. 1: ${SALAR1:,.0f}")
print(f"SALARIO VENDEDORES DEPTO. 2: ${SALAR2:,.0f}")
print(f"SALARIO VENDEDORES DEPTO. 3: ${SALAR3:,.0f}")
