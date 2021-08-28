package com.temperies.cars.controllers;

import com.temperies.cars.model.Car;
import com.temperies.cars.services.ICarService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.temperies.cars.utils.ConstantsHelper.*;

@RestController
@AllArgsConstructor
@RequestMapping(PATH_PROJECT)
public class CarsController {
    private final ICarService iCarService;

    @ApiOperation(value = "List of all available cars")
    @GetMapping(value = PATH_FIND_ALL)
    public List<Car> findAll() {
        return iCarService.findAll();
    }

    @ApiOperation(value = "Search a car with and id")
    @GetMapping(value = PATH_FIND_BY_ID)
    public Optional<Car> findById(@PathVariable("id") Long id) {
        return iCarService.findById(id);
    }

    @ApiOperation(value = "Add a car")
    @PostMapping(value = PATH_CREATE)
    @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Car resource) {
        return iCarService.create(resource);
    }

    @ApiOperation(value = "Update a car")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "true: Successfully updated / false: The resource you were trying to reach is not found"),
        }
    )
    @PutMapping(value = PATH_UPDATE)
    @ResponseStatus(HttpStatus.OK)
    public boolean update(@PathVariable( "id" ) Long id, @RequestBody Car resource) {
        return iCarService.update(id, resource);
    }

    @ApiOperation(value = "Delete a car")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "true: Successfully deleted / false: The resource you were trying to reach is not found"),
        }
    )
    @DeleteMapping(value = PATH_DELETE)
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@PathVariable("id") Long id) {
        return iCarService.deleteById(id);
    }
}
