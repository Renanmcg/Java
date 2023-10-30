package Supplier;

import java.util.function.Supplier;

class ModelInstanceSupplier {
    public static Supplier<ModelClass> getModelInstanceSupplier(String name) {
        return () -> new ModelClass(name);
    }
}