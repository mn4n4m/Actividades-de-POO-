# Ejercicio Propuesto No. 22
# Mostrar nombre y salario mensual solo si es mayor a $450.000

# Entrada de datos
nombre = input("Ingrese el nombre del empleado: ")
salario_hora = float(input("Ingrese el salario básico por hora: "))
horas_mes = int(input("Ingrese el número de horas trabajadas en el mes: "))

# Cálculo del salario mensual
salario_mensual = salario_hora * horas_mes

# Salida condicionada
if salario_mensual > 450000:
    print(f"\nEmpleado: {nombre}")
    print(f"Salario mensual: ${salario_mensual:,.0f}")
else:
    print(f"\nEmpleado: {nombre}")
