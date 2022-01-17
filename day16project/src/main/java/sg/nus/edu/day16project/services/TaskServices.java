package sg.nus.edu.day16project.services;

import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.nus.edu.day16project.repositories.TaskRepository;

@Service
public class TaskServices {

    @Autowired
    private TaskRepository taskrepo;

    public boolean hasHey(String key){
        Optional<String> opt = taskrepo.get(key);
        return opt.isPresent();
    }

    public Optional<String> get(String key){
        return Optional.isNullable(
            taskrepo.opsforValue().get(key));
    }
    
    public void save(String key, String values){
        String l = values.stream()
            .collect(Collectors)

    } 
}
