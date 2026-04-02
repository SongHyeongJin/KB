//1. 서버 구성
// Express서버로 JSON파일(data.json)을 직접 읽고/쓰면서 (Create,Read,Update,Delete)기능 구현
//data.json => 데이터베이스를 대신함

const express = require('express'); //express 모듈 가져오기 웹서버를 쉽게 만들수 있게 제공하는 Nodejs 프레임워크
const fs = require('fs/promises'); //파일 읽기/쓰기 기능을 promise 기반으로 사용할 수 있게 제공해주는 기능

const path = require('path');

// express 어플리케이션 생성
const app = express();

//서버가 실행될 포트 번호
const port = 3000;
//현재 파일이 있는 폴더(__dirname)를 기준으로 data.json의 절대경로 생성
//C:\KB_workspace\6_1Vuejs\vuejs_ex\vuejs07\rest-api\server\data.json
const dataFilePath = path.join(__dirname, 'data.json');

//COS 설정   다른 주소 (예: vue 프론트엔드 )서버에서도 3000서버에게 요청할 수 있도록 허용
app.use(express.json());
app.use((req, res, next) => {
  // 모든 출처(orgin)에서 접근 허용
  res.header('Access-Control-Allow-Origin', '*'); // 허용할 HTTP 메서드 지정
  res.header('Access-Control-Methods', 'GET,POST,PUT,PATCH,DELETE');
  //라우팅
  next();
});

//2. 서버에서 제공하는 HTTP 메서드 GET,POST,DELETE,PUT 기능 생성
// GET : /api/data  => 전체 데이터 조회
// POST: /api/data  => 새 데이터 추가
// PUT : /api/data/:id => 특정 id의 데이터 전체 수정
// PATCH : /api/data/:id   => 특정 id 데이터의 일부 수정
// DELETE : /api/data/:id  => 특정 id의 데이터 삭제
///  해당 조작에 의한 결과 데이터는 data.json 저장된다.

//GET : 모든데이터 가져오기

app.get('/api/data', async (req, res) => {
  try {
    const data = await readDataFile();
    res.json(data);
  } catch (error) {
    res.status(500).json({ error: 'Internal Server Error' });
  }
});

app.post('/api/data', async (req, res) => {
  try {
    const newData = req.body;
    const data = await readDataFile();
    const writeData = {};
    data.push(writeData);
    await writeData(data);
    res.json(newData);
  } catch (error) {
    res.status(500).json({ error: 'Internal Server Error' });
  }
});
// app.put();
// app.patch();
// app.delete();

//Helper 함수 : 데이터 파일 읽기
async function readDataFile() {
  const data = await fs.readFile(dataFilePath, 'utf-8');
  return data ? JSON.parse(data) : [];
}

//Helper 함수 : 데이터 파일 쓰기
