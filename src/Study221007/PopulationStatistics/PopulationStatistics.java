package Study221007.PopulationStatistics;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PopulationStatistics {

    public void read(String address) {
        try (BufferedReader br = Files.newBufferedReader(
                Paths.get(address), StandardCharsets.UTF_8)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readByChar(String address) throws IOException {
        FileReader fileReader = new FileReader(address);

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }

    public List<PopulationMove> readFileByLine(String address) throws IOException {

        //삽
        List<PopulationMove> populationMoveList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(address)
        );
        String str;
        //while문 안에서 string을  populationmove로 parsing하여 pml에 add. 루프가 끝나면 파일을 모두 읽어서 파싱을 끝냈으면 retrun
        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove populationMove = parse(str);
            populationMoveList.add(populationMove);
        }
        reader.close();

        return populationMoveList;
    }
    public void readAllLines(String address) throws IOException{
        List<String> lines = Files.readAllLines(Paths.get(address), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item -> {
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0], splittedLine[6]);
                }).collect(Collectors.toList());
        for (PopulationMove populationMove : pms) {
            System.out.println(populationMove.getFromSido());
        }

    }
    public PopulationMove parse(String data) throws IOException {
        //csv
        String[] splittedLine = data.split(",");
//        return new PopulationMove(splittedLine[6], splittedLine[0]); // Write 원하는 자료만 골라오기
        return new PopulationMove(splittedLine[0], splittedLine[1]); // Print 전입 from 전출 to 6, 0 pasing logic 변경
    }

    //파일 생성하기
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

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }
/*    Logic
    1.List<PopulationMove>를 순환하면서 "11,26" 같은 형태의 key를 만든다.
    2.moveCntMap에서 해당 key에 해당하는 Object가 없으면 생성하고 1이라고 check한다.
    3.key로 꺼내서 +1
    4.return moveCntMap*/
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> populationMoveList) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove populationMove : populationMoveList) {
            String key = populationMove.getFromSido() + "," + populationMove.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("11", 0);
        map.put("26", 1);
        map.put("27", 2);
        map.put("28", 3);
        map.put("29", 4);
        map.put("30", 5);
        map.put("41", 6);
        map.put("42", 7);
        map.put("43", 8);
        map.put("44", 9);
        map.put("45", 10);
        map.put("46", 11);
        map.put("47", 12);
        map.put("48", 13);
        map.put("50", 14);
        return map;
    }

    public static void main(String[] args) throws IOException {
//        final String address = "/Users/eungjun/Downloads/2021_인구관련연간자료_20220927_66125.csv"; //Write
        final String address = "./from_to.txt"; //Print
        final String targetFile = "for_heatmap.txt"; //heatmap용
//        final String targetFile = "each_sido_cnt.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> populationMoveList = populationStatistics.readFileByLine(address);
        Map<String, Integer> map = populationStatistics.getMoveCntMap(populationMoveList); // Mapping
        Map<String, Integer> heatMapIdxMap = populationStatistics.heatmapIdxMap();
        populationStatistics.createAFile(targetFile);

        List<String> cntResult = new ArrayList<>();

        for(String key : map.keySet()){
            String[] fromto = key.split(","); // mapping해서 저장

            String s = String.format("[%s, %s, %d]\n",heatMapIdxMap.get(fromto[0]),heatMapIdxMap.get(fromto[1]),map.get(key));
//            String s = String.format("key:%s value:%d\n",key,map.get(key)); //cnt 저장
            cntResult.add(s);
//            System.out.printf("key:%s value:%d\n",key,map.get(key));
        }
        populationStatistics.write(cntResult, targetFile);
/*        // Read Method
        populationStatistics.readByChar(address);
        populationStatistics.read(address);*/
/*        //Size
        System.out.println(populationMoveList.size());*/
/*
        //Create
        populationStatistics.createAFile("each_sido_cnt.txt");
*/
/*        //Print
        for (PopulationMove populationMove : populationMoveList) {
            System.out.printf("전입:%s, 전출:%s\n", populationMove.getFromSido(), populationMove.getToSido());
        }*/
/*        //Write
        List<String> strings = new ArrayList<>();
        for(PopulationMove populationMove : populationMoveList){
            String fromTo = populationStatistics.fromToString(populationMove);
            strings.add(fromTo);
        }
        populationStatistics.write(strings, "./from_to.txt");*/
    }
}