package frc.robot.controls;

import edu.wpi.first.wpilibj.Joystick;

//OI class: A control system class
//OI class checks control inputs such as joysticks and buttons and update the variables accordingly.
//You will find this class being used essentially everywhere (unless it is not).

public class OI {

    //Joystick takes in the port number? <-- Not very sure, ask the builders or even the instructors to know more.
    public static final Joystick COLOR_STICK = new Joystick(2);
    public static final Joystick LEFT_STICK = new Joystick(0);
    public static final Joystick RIGHT_STICK = new Joystick(1);

    public static final Button BLUE_BUTTON = new Button(COLOR_STICK, 1);
    public static final Button RED_BUTTON = new Button(COLOR_STICK, 2);
    public static final Button YELLOW_BUTTON = new Button(COLOR_STICK, 3);
    public static final Button GREEN_BUTTON = new Button(COLOR_STICK, 4);
    public static final Button PNEU_FORWARD_BUTTON = new Button(COLOR_STICK, 5);
    public static final Button PNEU_BACKWARD_BUTTON = new Button(COLOR_STICK, 6);


    //Since index starts at 0, using the codes above as index needs to subtract 1.
    private static Button[] buttons = new Button[]
    {
        BLUE_BUTTON,
        RED_BUTTON,
        YELLOW_BUTTON,
        GREEN_BUTTON,
        PNEU_FORWARD_BUTTON,
        PNEU_BACKWARD_BUTTON
    };

    //Getting the inputs of the joystick and update the variables
    public static void update()
    {
        for (int i = 0; i < buttons.length; i++) 
        {
            buttons[i].setStates();
        }
    }
}