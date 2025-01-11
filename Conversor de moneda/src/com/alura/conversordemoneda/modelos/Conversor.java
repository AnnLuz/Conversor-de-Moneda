package com.alura.conversordemoneda.modelos;

import com.sun.jdi.Value;

public record Conversor(String base_code,String target_code ,double conversion_rate, double conversion_result) {


}
