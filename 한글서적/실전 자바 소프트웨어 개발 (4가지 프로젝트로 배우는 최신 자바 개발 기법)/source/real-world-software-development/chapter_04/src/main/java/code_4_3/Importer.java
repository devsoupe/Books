package code_4_3;

import code_4_2.Document;

import java.io.File;
import java.io.IOException;

interface Importer {

    Document importFile(File file) throws IOException;
}
