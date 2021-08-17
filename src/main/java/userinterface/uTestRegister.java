package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class uTestRegister {
    public static final Target Register_Button = Target.the("Este boton abre el formulario")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target Input_Firts_Name = Target.the("Se ingresa el primer nombre")
            .located(By.id("firstName"));
    public static final Target Input_Last_Name = Target.the("Se ingresa el apellido")
            .located(By.id("lastName"));
    public static final Target  Input_Email = Target.the("Se ingresa el email")
            .located(By.id("email"));
    public static final Target Input_Mont = Target.the("Se ingresa el mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target Input_Day = Target.the("Se ingresa el dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target Input_Year = Target.the("Se ingresa el año de nacimiento")
            .located(By.id("birthYear"));
    public static final Target Next_Button = Target.the("Next:Location")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target City = Target.the("Ciudad")
            .located(By.id("city"));
    public static final Target Zip = Target.the("Code")
            .located(By.id("zip"));
    public static final Target Next_Button_Devices = Target.the("Next:Devices")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target Button_Next_Last = Target.the("Next:Last_Step")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target Password = Target.the("Contraseña")
            .located(By.id("password"));
    public static final Target Confirm_Password = Target.the("Confirmar Contraseña")
            .located(By.id("confirmPassword"));
    public static final Target Informed = Target.the("Informado")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target Terms = Target.the("Terminos y Condiciones")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target Privacy = Target.the("Politicas de Seguridad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target Button_Complete = Target.the("Completado")
            .located(By.xpath("//*[@id='laddaBtn']"));
    public static final Target Text = Target.the("Texto de botton")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a/span"));
}
