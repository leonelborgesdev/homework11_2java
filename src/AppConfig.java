import com.taskmanager.domain.Task;
import com.taskmanager.domain.TaskService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AppConfig {
    public static void main(String[] args) {
        // El primer paso importante es buscar las dependencias/librerías de Spring e importarlas al classpath
        // Para ahorrar el paso de búsqueda de los JAR's, las hemos dejado al alcance
        // en una carpeta llamada 'dependencias-para-agregar-classpath'
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TaskService taskService = context.getBean("taskService", TaskService.class);
        // Usa taskService para realizar operaciones con tareas

        // Ejemplo 1: Obtener una tarea por su ID
        Task task = taskService.getTaskById(1);
        System.out.println("Tarea obtenida por ID:");
        System.out.println(task);

        // Ejemplo 2: Agregar una nueva tarea
        Task newTask = new Task();
        newTask.setId(2);
        newTask.setTitle("Implement Data Persistence");
        newTask.setDescription("Store tasks in a database.");
        //newTask.setDueDate(LocalDate.of(2023, 9, 15));
        taskService.addTask(newTask);
        System.out.println("Nueva tarea agregada:");

        // Ejemplo 3: Obtener todas las tareas
        List<Task> allTasks = taskService.getAllTasks();
        System.out.println("Todas las tareas:");
        for (Task t : allTasks) {
            System.out.println(t);
        }

        // Cerrar el contexto de Spring
        context.close();
    }
}