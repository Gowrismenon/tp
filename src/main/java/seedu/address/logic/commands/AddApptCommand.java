package seedu.address.logic.commands;

import static seedu.address.logic.parser.CliSyntax.PREFIX_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TIME;

import seedu.address.model.Model;

/**
 * Adds an appointment to the address book.
 */
public class AddApptCommand extends Command {

    public static final String COMMAND_WORD = "add_appt";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Adds an appointment for a person at the specified date and time.\n"
            + "Parameters: NAME "
            + PREFIX_DATE + "DATE "
            + PREFIX_TIME + "TIME\n"
            + "Example: " + COMMAND_WORD + " Alex Yeoh "
            + PREFIX_DATE + "2026-03-11 "
            + PREFIX_TIME + "9:00";

    private final String person;
    private final String date;
    private final String time;

    /**
     * Creates an AddApptCommand to add the specified appointment.
     *
     * @param person The name or identifier of the person.
     * @param date The date of the appointment.
     * @param time The time of the appointment.
     */
    public AddApptCommand(String person, String date, String time) {
        this.person = person;
        this.date = date;
        this.time = time;
    }

    @Override
    public CommandResult execute(Model model) {
        return new CommandResult(String.format(
                "WORK IN PROGRESS: Appointment parsed for %s on %s at %s.",
                person, date, time));
    }
}