package com.cybertek.implementation;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractMapService<ID, T> {

    protected Map<ID, T> map = new HashMap<>();

}
