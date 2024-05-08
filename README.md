# Java

1. **Paciente**:
   - Atributos:
     - Nombre
     - Dirección
     - Número de teléfono
     - Fecha de nacimiento
     - Información médica relevante (alergias, condiciones médicas preexistentes, etc.)
   - Métodos:
     - Método para actualizar la información del paciente
     - Método para obtener la edad del paciente
     - Método para programar una cita

2. **Médico**:
   - Atributos:
     - Nombre
     - Especialidad
     - Horario de consulta
     - Número de teléfono
   - Métodos:
     - Método para actualizar la información del médico
     - Método para agregar un horario de consulta
     - Método para listar las citas programadas para el médico

3. **Turno**:
   - Atributos:
     - Fecha y hora
     - Paciente asociado
     - Médico asignado
     - Motivo de la consulta
   - Métodos:
     - Método para programar un turno
     - Método para cancelar un turno
     - Método para verificar la disponibilidad de un médico en una fecha y hora específicas

4. **Internación**:
   - Atributos:
     - Fecha y hora de ingreso
     - Fecha y hora de egreso
     - Habitación asignada
     - Paciente asociado
     - Médico a cargo
   - Métodos:
     - Método para registrar la internación de un paciente
     - Método para dar de alta a un paciente
     - Método para verificar la disponibilidad de habitaciones

5. **Estudio**:
   - Atributos:
     - Tipo de estudio (radiografía, análisis de sangre, ecografía, etc.)
     - Fecha y hora del estudio
     - Paciente asociado
     - Médico a cargo
     - Resultados
   - Métodos:
     - Método para programar un estudio
     - Método para registrar los resultados de un estudio
     - Método para buscar estudios por paciente o médico

6. **Factura**:
   - Atributos:
     - Detalles de los servicios prestados
     - Paciente asociado
     - Médico a cargo
     - Monto total
   - Métodos:
     - Método para generar una factura
     - Método para calcular el monto total
     - Método para listar las facturas emitidas en un período de tiempo específico

7. **Servicio**:
   - Atributos:
     - Tipo de servicio (consulta médica, estudio médico, internación, etc.)
     - Costo
     - Duración
   - Métodos:
     - Método para agregar un nuevo servicio
     - Método para actualizar la información de un servicio
     - Método para listar todos los servicios disponibles

8. **Horario**:
   - Atributos:
     - Días de la semana
     - Horas de trabajo
     - Médico asociado
   - Métodos:
     - Método para agregar un nuevo horario de trabajo para un médico
     - Método para verificar la disponibilidad de un médico en un horario específico
     - Método para actualizar el horario de un médico
