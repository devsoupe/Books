package code_4_2;

import java.io.File;
import java.io.IOException;

interface Importer {

    Document importFile(File file) throws IOException;
}
