# Ejercicio Resuelto No. 10
# Calcular el pago de matrícula según el patrimonio y estrato social

# Entrada de datos
NI = input("Ingrese el número de inscripción: ")
NOM = input("Ingrese el nombre del estudiante: ")
PAT = float(input("Ingrese el patrimonio: "))
EST = int(input("Ingrese el estrato social: "))

# Proceso
PAGMAT = 50000
if PAT > 2000000 and EST > 3:
    PAGMAT += 0.03 * PAT

# Salida
print(f"\nEL ESTUDIANTE CON NUMERO DE INSCRIPCIÓN {NI} Y NOMBRE {NOM} DEBE PAGAR: ${PAGMAT:,.0f}")
