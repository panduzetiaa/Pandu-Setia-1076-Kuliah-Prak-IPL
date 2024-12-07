class KelasPengguna {
    protected String username; // Nama pengguna
    protected String password; // Kata sandi

    // Konstruktor untuk inisialisasi
    public KelasPengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metode untuk menyimpan nama pengguna dan kata sandi
    public void setCredentials(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metode untuk menampilkan nama pengguna dan kata sandi
    public void displayUser() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    // Metode untuk memvalidasi kata sandi
    public boolean validatePassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
