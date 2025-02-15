
# Job Listing and Search Platform  

## 📌 Overview  
This project is a **job listing and search platform** that helps users find job profiles based on the **tech stacks** they are skilled in. The system enables efficient job searches, making it easier for candidates to discover relevant opportunities.  

## 🚀 Features  
- **Job Listing** – Companies or admins can post job openings.  
- **Tech Stack-Based Search** – Users can search for jobs by specifying the required technologies.  
- **MongoDB Storage** – Jobs and user data are stored securely in a **NoSQL database**.  
- **Spring Boot & Hibernate** – Ensures fast performance and seamless integration.  

## 🛠️ Tech Stack  
- **Backend:** Spring Boot, Hibernate  
- **Database:** MongoDB  
- **Architecture:** RESTful APIs  

## 📂 Installation & Setup  
1. Clone the repository:  
   ```sh
   git clone https://github.com/madame-vaishnavi/JobPost.git
   cd JobProj
   ```  
2. Configure MongoDB connection in `application.properties` or `application.yml`.  
3. Run the application:  
   ```sh
   mvn spring-boot:run
   ```  

## 📖 API Endpoints (Sample)  
| Method | Endpoint | Description |
|--------|---------|------------|
| `GET` | `/posts` | Fetch all job listings |
| `POST` | `/addPost` | Create a new job listing |
| `GET` | `/post/{string}` | Search jobs by tech stack |

## 💡 Future Enhancements  
- User authentication & role-based access.  
- Job application tracking system.  
- Integration with external job boards.  
