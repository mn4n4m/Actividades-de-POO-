# Ejercicio Propuesto No. 32
# Calcular el valor a pagar con descuentos según la cantidad de escritorios comprados

# Constante del valor por escritorio
valor_escritorio = 800000

# Entrada de datos
unidades = int(input("Ingrese la cantidad de escritorios que desea comprar: "))

# Cálculo del descuento
if unidades < 5:
    descuento = 0.10
elif unidades < 10:
    descuento = 0.20
else:
    descuento = 0.40

# Cálculo total
subtotal = unidades * valor_escritorio
valor_descuento = subtotal * descuento
total_pagar = subtotal - valor_descuento

# Salida
print(f"\nCantidad de escritorios: {unidades}")
print(f"Subtotal: ${subtotal:,.0f}")
print(f"Descuento aplicado: {descuento * 100:.0f}%")
print(f"Valor a pagar: ${total_pagar:,.0f}")
