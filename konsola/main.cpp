#include <iostream>

class Device {
    public: 
        void print(std::string text) {
            std::cout << text << std::endl; 
        }
};

int main() {
    Device device;

    return 0;
}