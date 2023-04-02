package com.openbootcamp.Interfaces;

import com.openbootcamp.Coche;
import com.openbootcamp.CocheElectrico;
import com.openbootcamp.Interfaces.CocheService;

public class CocheServiceClassicImpl implements CocheService {


    @Override
    public Coche crearCocheDemo() {
        System.out.println("creando coche clasico");
        return new CocheElectrico();
    }
}
