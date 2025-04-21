# Ejercicio Resuelto No. 12
# Calcular salario con horas normales, extras dobles y extras triples

# Entrada de datos
NOM = input("Ingrese el nombre del trabajador: ")
NHT = int(input("Ingrese el número de horas trabajadas en la semana: "))
VHN = float(input("Ingrese el valor por hora normal: "))

# Proceso
if NHT > 40:
    HET = NHT - 40
    if HET > 8:
        HEE8 = HET - 8
        SALARIO = 40 * VHN + 8 * 2 * VHN + HEE8 * 3 * VHN
    else:
        SALARIO = 40 * VHN + HET * 2 * VHN
else:
    SALARIO = NHT * VHN

# Salida
print(f"\nEL TRABAJADOR {NOM} DEVENGÓ: ${SALARIO:,.0f}")
