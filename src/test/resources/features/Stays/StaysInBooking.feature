Feature: Realizar una reserva en Booking
  Yo como usuario
  quiero realizar una reserva en Booking

  Scenario Outline: Happy Path - Realizar una reserva de alojamiento en Booking
    Given que <usuario> abre la aplicacion de Booking
#    And que navega hasta la sección de Alojamientos
#    And que realiza una búsqueda para <num_habitaciones> habitación(es), <num_adultos> adulto(s) y <num_niños> niño(s) menor(es) en la ciudad de <ciudad> entre las fechas <fecha_entrada> y <fecha_salida>
    And que realiza una búsqueda de alojamiento
    And que selecciona la segunda opción de alojamiento encontrada
    And que selecciona sus habitaciones
    And que selecciona su alojamiento
    And que confirma su reserva
    And que proporciona los datos requeridos para la reserva
    And que valida los detalles de la reserva y procede
    When elige el método de pago y completa la transacción
    Then se valida el monto a pagar
#
    Examples:
      | usuario | num_habitaciones | num_adultos | num_niños | ciudad | fecha_entrada | fecha_salida |
      | John    | 1                | 2           | 1         | Cusco  | 2024-05-01    | 2024-05-03   |
#      | Neo       | 2                | 3           | 2         | Madrid  | 2024-06-10    | 2024-06-15   |
#      | Trinity   | 1                | 1           | 0         | Roma    | 2024-08-05    | 2024-08-08   |
