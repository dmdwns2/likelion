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
                + "','" +hospital.getEmergency_room()+ "','" +hospital.getName()+ "','" +hospital.getSubdivision()+ "'),\n";
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
    public String subdivision(String name, String division){
        if(name.contains("외과") || division.contains("외과")){
            division = "외과";
        }
        else if(name.contains("내과") || division.contains("내과")){
            division = "내과";
        }
        else if(name.contains("피부") || division.contains("피부")){
            division = "피부과";
        }
        else if(name.contains("성형") || division.contains("성형")){
            division = "성형외과";
        }
        else if(name.contains("치과") || division.contains("치과")){
            division = "치과";
        }
        else if(name.contains("한의원") || division.contains("한의원")){
            division = "한의원";
        }
        else if(name.contains("소아") || division.contains("소아")){
            division = "소아";
        }
        else if(name.contains("가정의학") || division.contains("가정의학")){
            division = "가정의학과";
        }
        else if(name.contains("정형") || division.contains("정형")){
            division = "정형외과";
        }
        else division = "";

        return division;
    }
    public Hospital parse(String data) throws IOException {
        //csv
        String[] splittedLine = data.split(",");
//        return new Hopistal(splittedLine[6], splittedLine[0]); // Write 원하는 자료만 골라오기
        return new Hospital(splittedLine[0], splittedLine[1], splittedLine[1].split(" ")[0]+" "+splittedLine[1].split(" ")[1], splittedLine[2], splittedLine[6], splittedLine[10], subdivision(splittedLine[10],splittedLine[8]));
        // 구를 나누기위해 스플릿을 이용해서 ~~ ~~구 를 두개를 더해줌.
        // subdivision함수 사용됨.
    }

    public static void main(String[] args) throws IOException {
        final String address = "/Users/eungjun/Downloads/서울시 병의원 위치 정보3.csv"; //Write
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
