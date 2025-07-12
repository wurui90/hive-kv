package org.hivekv;

import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RocksDbCli {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = test test test" + i + 1);
        }

        try {
            RocksDB db;
            db = RocksDB.open("rocksdb_dir");
            String key = "12";
            String value = "34";
            db.put(key.getBytes(), value.getBytes());
            db.close();
        } catch (RocksDBException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        try {
            RocksDB db;
            db = RocksDB.open("rocksdb_dir");
            String key = "12";
            System.out.println(new String(db.get(key.getBytes())));
            db.close();
        } catch (RocksDBException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}