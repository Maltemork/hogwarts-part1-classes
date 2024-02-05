abstract class TeachingMaterial {
    private String name;
    private boolean onShoppingList;
    private boolean required;
    private boolean provided;
    private String notes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOnShoppingList() {
        return onShoppingList;
    }

    public void setOnShoppingList(boolean onShoppingList) {
        this.onShoppingList = onShoppingList;
    }

    public boolean getRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public boolean getProvided() {
        return provided;
    }

    public void setProvided(boolean provided) {
        this.provided = provided;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
