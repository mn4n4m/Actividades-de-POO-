# Ejercicio Propuesto No. 33
# Juego de preguntas: si se falla una, termina el juego

print("Responda con 'SI' o 'NO' a las siguientes preguntas:")

# Pregunta 1
respuesta1 = input("1. ¿Simón Bolívar libertó a Colombia? ").strip().upper()

if respuesta1 == "SI":
    # Pregunta 2
    respuesta2 = input("2. ¿Camilo Torres fue un guerrillero? ").strip().upper()

    if respuesta2 == "SI":
        # Pregunta 3
        respuesta3 = input("3. ¿El Binomio de Oro es un grupo de música vallenata? ").strip().upper()

        if respuesta3 == "SI":
            print("\n¡Ganaste el juego! Respondiste correctamente las tres preguntas.")
        else:
            print("\nRespuesta incorrecta. ¡Fin del juego!")
    else:
        print("\nRespuesta incorrecta. ¡Fin del juego!")
else:
    print("\nRespuesta incorrecta. ¡Fin del juego!")
