Feature: Realizar una reserva en Booking
  Yo como usuario
  quiero realizar una reserva en Booking

  Scenario Outline: Happy Path - Realizar una reserva de alojamiento en Booking
    Given que <usuario> abre la aplicacion de Booking
   And que realiza una búsqueda de alojamiento
    And que selecciona la segunda opción de alojamiento encontrada
    And que selecciona sus habitaciones
    And que selecciona su alojamiento
    And que confirma su reserva
    And que proporciona los datos requeridos para la reserva
    And que valida los detalles de la reserva y procede
    When elige el método de pago y completa la transacción
    Then se valida el monto a pagar

    Examples:
      | usuario | num_habitaciones | num_adultos | num_niños | ciudad | fecha_entrada | fecha_salida |
      | John    | 1                | 2           | 1         | Cusco  | 2024-05-01    | 2024-05-03   |
