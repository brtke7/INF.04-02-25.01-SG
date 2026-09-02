#include <iostream>

class Device 
{
    public: 
        void print(std::string text) 
        {
            std::cout << text << std::endl; 
        }
};

class WashingMachine : public Device
{
    private: 
        int program_number = 0;

    public: 
        int set_program(int program_number) 
        {
            if (program_number >= 1 && program_number <= 12) 
            {
                this->program_number = program_number;
            } else 
            {
                this->program_number = 0;
            }

            return this->program_number;
        }
};

class VacuumCleaner : public Device 
{
    private: 
        bool vacuum_running = false; 

    public: 
        void on() 
        {
            if (this->vacuum_running == false) 
            {
                this->vacuum_running = true;
                this->print("Odkurzacz włączono");
            }
        };

        void off()
        {
            if (this->vacuum_running == true) 
            {
                this->vacuum_running = false;
                this->print("Odkurzacz wyłączono");
            }  
        }
};

int main() {
    return 0;
}