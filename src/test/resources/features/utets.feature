#Autor: Alex Fabian Suarez Caviedes

@stories
  Feature: Registro en Utest,
    Un usuario esta interesado en registrarse en la pagina de Utest, para realizar testing
    @scenario1
    Scenario: Registro en Utest
      Given Alex abre la pagina Utest y da click en el boton JoinToday
      When Luego continua con el registro de sus datos en los formularios
        |first_Name|last_Name|email_Address      |month_Birth|day_Birth|year_Birth|language_Language|city_City  |postal_Code|country_Country|srtWindows|srtVersion|srtLanguage|srtMobile|srtModel|srtSystem    |create_Password|confirm_Password|
        |Alex      |Suarez   |RoseDewitt@gmail.com  |October    |27       |2001        |Spanish          |Neiva     |12345     | Colombia       |Windows   |10        |Spanish    |Apple   |iPad Air |iOS 12.5     |Alexparra2710  |Alexparra2710   |
      Then Por ultimo da click y lee el mensaje del boton
        |srtQuestion   |
        |Complete Setup|