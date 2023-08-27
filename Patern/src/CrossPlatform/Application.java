package CrossPlatform;

public class Application {
   private Dialog dialog;

        public void initialize() throws Exception {
            Config config = readApplicationConfigFile();

            if (config.getOS().equals("Windows")) {
                dialog = new WindowsDialog();
            } else if (config.getOS().equals("Web")) {
                dialog = new WebDialog();
            } else {
                throw new Exception("Error! Unknown operating system.");
            }
        }

        public void main() throws Exception {
            initialize();
            dialog.render();
        }

        private Config readApplicationConfigFile() {
            // Логика чтения конфигурационного файла
            return null;
        }
    }


