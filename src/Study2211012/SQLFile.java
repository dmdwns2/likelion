package Study2211012;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLFile {
    public void createAFile(String address) {
        File file = new File(address);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void write(List<String> strs, String address) {
        File file = new File(address);
        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(file)
            );
            for (String str : strs
            ) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String fromToString(Hospital hospital) {
        return "('" +hospital.getId() + "','" + hospital.getAddress()+ "','" +hospital.getDistrict()+ "','" +hospital.getCategory()
                + "','" +hospital.getEmergency_room()+ "','" +hospital.getName()+ "','" +hospital.getSubdivision()+ "')\n";
    }
    public List<Hospital> readFileByLine(String address) throws IOException {

        //삽
        List<Hospital> hospitalList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(address)
        );
        String str;
        //while문 안에서 string을  populationmove로 parsing하여 pml에 add. 루프가 끝나면 파일을 모두 읽어서 파싱을 끝냈으면 retrun
        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
            Hospital hospital = parse(str);
            hospitalList.add(hospital);
        }
        reader.close();

        return hospitalList;
    }

    public Hospital parse(String data) throws IOException {
        //csv
        String[] splittedLine = data.split(",");
//        return new Hopistal(splittedLine[6], splittedLine[0]); // Write 원하는 자료만 골라오기
        return new Hospital(splittedLine[0], splittedLine[1], splittedLine[1].substring(0,10), splittedLine[2], splittedLine[6], splittedLine[8], splittedLine[10]);
        // Print 전입 from 전출 to 6, 0 pasing logic 변경
    }

    public static void main(String[] args) throws IOException {
        final String address = "/Users/eungjun/Downloads/서울시 병의원 위치 정보2.csv"; //Write
//        final String address = "./from_to.txt"; //Print
//        final String targetFile = "for_heatmap.txt"; //heatmap용
//        final String targetFile = "each_sido_cnt.txt";
        SQLFile sqlFile = new SQLFile();
        List<Hospital> hospitalList = sqlFile.readFileByLine(address);

        //Create
        sqlFile.createAFile("hospital_cnt.sql");
                //Write
        List<String> strings = new ArrayList<>();
        for(Hospital hospital : hospitalList){
            String fromTo = sqlFile.fromToString(hospital);
            strings.add(fromTo);
        }
        sqlFile.write(strings, "./hospital_cnt.sql");
//        Map<String, Integer> map = sqlFile.getMoveCntMap(populationMoveList); // Mapping
//        Map<String, Integer> heatMapIdxMap = sqlFile.heatmapIdxMap();
//        sqlFile.createAFile(targetFile);

//        List<String> cntResult = new ArrayList<>();
        //Create
/*        sqlFile.createAFile("each_sido_cnt.txt");
        for(String key : map.keySet()){
            String[] fromto = key.split(","); // mapping해서 저장

            String s = String.format("[%s, %s, %d],\n",heatMapIdxMap.get(fromto[0]),heatMapIdxMap.get(fromto[1]),map.get(key));
//            String s = String.format("key:%s value:%d\n",key,map.get(key)); //cnt 저장
            cntResult.add(s);*/
//            System.out.printf("key:%s value:%d\n",key,map.get(key));
    }
//        sqlFile.write(cntResult, targetFile);
}
